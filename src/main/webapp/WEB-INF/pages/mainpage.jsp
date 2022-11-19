
<html>
<head>
<style>
.wrap{
    display: flex;
    align-items: center;
    justify-content: middle-center;
    background: white;
    height:100vh;
    width: 100%;
    margin:0;
    padding:0;
}
</style>
<style>
.search{
 {
    border: 3px solid green;
    display: flex;
    align-items: center;
    justify-content: up-center;
    background: white;
    height:auto;
    width: 50%;
    margin:auto;
    padding:10x;
}
</style>

<style>
table, th, td {
  border:1px solid black;
}
</style>

<script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
</head>
<div class="wrap">

<div class="search">
      <input type="text" class="searchTerm" placeholder="Search">
      <button type="add" id="add" class="addButton">
        ADD
     </button>
     <button type="submit" id="search" class="searchButton">
             SEARCH
      </button>

   </div>

   <table style="width:50%">
     <tr style="height:35px">
       <th>Eid</th>
       <th>EName</th>
       <th>DOJ</th>
       <th>YOE</th>
       <th>Designation</th>
     </tr>
     <tr style="height:35px">
       <td>1</td>
       <td>ABC</td>
       <td>20-12-2020</td>
       <td>5</td>
       <td>Developer</td>
     </tr>
     <tr style="height:35px">
       <td></td>
       <td></td>
       <td></td>
       <td></td>
       <td></td>
     </tr>
      <tr style="height:35px">
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
           <tr style="height:35px">
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
   </table>

</div>
$("#search").click(
  function(){

        $.ajax({
          type: "POST",
          url: "/mainpage",
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
<script>
$("#add").click(function(){
window.location.href="/employeedetails";
});
</script>

</html>
