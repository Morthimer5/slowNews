/**
 * Created by Morthimer on 4/10/2016.
 */


   function highlight() {
        var str = document.getElementsByClassName("searchfild")[0].value;
        var regex = new RegExp(str, "gi");
        
    };

    function showFunction(id) {
        var display = document.getElementById(id).style.display;
        if( display === 'none'){
            document.getElementById(id).style.display = 'block';
        }else{
            document.getElementById(id).style.display = 'none';
        }

    }

