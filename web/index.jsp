<%-- 
    Document   : index
    Created on : Feb 11, 2019, 6:11:26 PM
    Author     : 1528178
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Assets/bootstrap.js" type="text/javascript"></script>
        <script src="Assets/Jquery.js" type="text/javascript"></script>
        <link href="Assets/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/index.css" rel="stylesheet" type="text/css"/>
        <script src="Assets/index.js" type="text/javascript"></script>

        <title>Devops</title>

        <style>


            .r1{
                margin-top: 10%;
            }
            /*            body{
                            background-image: url("Assets/dark-blue-and-black-abstract-corporate-background-vector-16629676.jpg");
                            background-repeat: no-repeat;
                            background-size: cover;
                            position: fixed;
                        }
                        label{
                            color:white;
                        }*/
            /*            .row{
                            background-color:#9421f333;
                        }*/


        </style>

    </head>
    <body background="">

        <div class="row r1">
            <div class="col-sm-offset-3 col-sm-6">
                <form class="form-horizontal" action="NewServlet" method="POST">
                    <br>
                    <div class="form-group">
                        &nbsp;&nbsp; <label class="control-label col-sm-3" for="email">Enter 1st value:</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="first" name="first" placeholder="Enter 1st value" required>
                        </div>
                    </div>
                    <br>
                    <div class="form-group">
                        &nbsp;&nbsp; <label class="control-label col-sm-3" for="email">Enter 2nd value:</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" id="second" name="second" placeholder="Enter 2nd value" required>
                        </div>
                    </div>
                    <br>
                    <div class="form-group">
                        &nbsp;&nbsp; <label class="control-label col-sm-3" for="email">Operation:</label>
                        <div class="col-sm-4">
                            <select class="form-control" id="operation" name="operation" required>
                                <option values="Addition">Addition</option>
                                <option values="Subtraction">Subtraction</option>
                                <option values="Multiplication">Multiplication</option>
                                <option values="Division">Division</option>
                            </select>

                        </div>							
                    </div>
                    <br>
                    <div class="form-group"> 
                        <div class="col-sm-offset-1 col-sm-3">
                            <button type="submit" class="btn btn-primary" id="submit">Calculate</button>

                        </div>
                        <div class="col-sm-offset-1 col-sm-3">
                            <button type="reset" class="btn btn-danger" id="reset">&nbsp;&nbsp;Reset&nbsp;&nbsp;</button>
                        </div>
                    </div>
                    <br>
                    <div class="well col-sm-12">
                        ${result}
                    </div>
                    <br>
                </form>
            </div> 
        </div>
    </body>

</html>
