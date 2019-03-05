$(function () {
    $("tbody>tr").click(function(){
        $(this).addClass('active_red').siblings().removeClass('active_red');
    });
})