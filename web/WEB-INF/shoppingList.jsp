

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${name} !</h1>
        
        <h1>List</h1>
        
        <form action="shoppingList" method="post">
            <input type="hidden" name="action" value="add">
            <label> Item: <input type="text" name="item" id="item"></label>
            <button type="submit">Submit</button>
            
        </form>
    </body>
</html>
