<html>
<style>
.detail{
    display: flex;
    align-items: center;
    justify-content: center;
    background: white;
    height:100vh;
    width: 100%;
    margin:0;
    padding:0;
}
</style>
<script src="https://cdn.jsdelivr.net/momentjs/2.12.0/moment.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
<!-- Employee Tracker -->
<div class="detail">

  <!-- Jumbotron -->
  <div class="jumbotron" style="background-color: black; color: white">

  </div>

  <div class="row">

    <div class="col-lg-12">

      <!-- Current Employees-->
      <div class="panel panel-primary">
        <div class="panel-heading">



      <!-- ADD EMPLOYEE  -->
      <div class="panel panel-primary">
        <div class="panel-heading">
          <h3 class="panel-title"><strong>ADD EMPLOYEE</strong></h3>
        </div>
        <div class="panel-body">

          <!-- Entry Form -->

            <div class="form-group">
              <label for="employee-name-input">EMPLOYEE ID</label>
              <input class="form-control" id="employee-name-input" type="text">
            </div>
            <div class="form-group">
              <label for="role-input">Employee Name</label>
              <input class="form-control" id="role-input" type="text">
            </div>
            <div class="form-group">
              <label for="start-input">Year of Experience</label>
              <input class="form-control" id="start-input" type="text">
            </div>
            <div class="form-group">
              <label for="rate-input">Designation</label>
              <input class="form-control" id="rate-input" type="text">
            </div>
            <button class="btn btn-primary" id="add-employee-btn" type="SAVE">SAVE</button>
             <button class="btn btn-primary" id="cancel-employee-btn" type="CANCEL">CANCEL</button>


        </div>

      </div>

    </div>

  </div>
  <!-- added content -->
  <div class="row">
    <div class="col-lg-12" id="images">
    </div>
  </div>

</div>
<p style="color:red; display:none"></p>
<script src="https://momentjs.com/downloads/moment-with-locales.js"></script>
<script src="https://www.gstatic.com/firebasejs/4.4.0/firebase.js"></script>
<script>
   function validateSignupForm(){
   var Eid=$("#employee-name-input").val();
   var EName=$("#role-input").val();
   var YOE=$("#start-input").val();
   var Designation=$("#rate-input").val();
   var error="";
   //if name is empty
   if(!Eid)
   {
   error+="Eid is empty.";
   }
   if(!EName)
   {
   error+="EName is empty.";
   }
   if(!YOE)
   {
   error+="YOE is empty.";
   }
   if(!Designation)
      {
      error+="Designation is empty.";
      }
   $("#employeedetails-error").html(error);


   if(error.length>0)
   {
   return false;
   }

   return true;
   }
  $("#add-employee-btn").click(
  function(){
      var isFormValid= validateSignupForm();
      if(isFormValid)
      {
       $("#employeedetails-error").hide();
       var user = {
       "Eid" : $("#employee-name-input").val(),
       "EName" : $("#role-input").val(),
       "YOE" : $("#start-input").val(),
       "Designation" : $("#rate-input").val()

      }
        $.ajax({
          type: "POST",
          url: "/employeedetails",
          data: JSON.stringify(user),
          success: function(response)
          {
            if(!!response)
            {
            alert(response.message);
            }
          },
          contentType: "application/json"
        })

      }
      else
      {
       $("#employeedetails-error").show();

      }

  });

  </script>
  <script>
  $("#cancel-employee-btn").click(function(){
  window.location.href="/mainpage";
  });
  </script>

</html>