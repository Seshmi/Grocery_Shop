<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home page</title>
<style>
body{
    background-image: urlimg//back.jpeg);
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;
    height: max-content;
}
.slide{
    width: 1100px;
    margin-left: 120px;
    margin-top: 80px;
	position:relative;
	display:flex;
    

    
}
.slider{
    overflow: hidden;
    
} 
.slider figure{
    position: relative;
    width: 500%;
    margin: 0;
    animation: 25s slider infinite;
}
.slider figure img{
    width: 20%;
    height: 80%;
    float: left;
    border: 2px solid black;
}
    @keyframes slider{
    0%{
        left:0;
    }
    10%{
        left:0;
    }
    20%{
        left:-100%;
    } 
    30%{
        left:-100%;
    } 
    40%{
        left:-200%;
    } 
    50%{
        left:-200%;
    } 
    60%{
        left:-300%;
    } 
    70%{
        left:-300%;
    } 
    90%{
        left:-400%;
    }
    100%{
        left:-400%;
    }
}
.container1{
    margin: 50px 50px 50px 5%;
    width: 90%;
    text-align: center;
    

}
.category{
    width: max-content;
    margin: -10px;
    border: 1px solid #18d471;
    border-radius: 0 0 50px 50px ;
    display:inline-block;
}
.category:hover{
    box-shadow: 0 0 10px 3px #0ae40a;
}
.item-image{
    height: 200px;
    width: 200px;
    border-radius: 0 0 50px 50px;
    padding: 8px;
    
    
}
.img-title{
    text-align: center;
    padding: 10px;
    font-weight: bold;
    font-size: 20;
    
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
.img-title1{
    text-align: center;
    padding: 10px;
    font-weight: bold;
    font-size: 20;
    color: rgb(1, 7, 14);    
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
a{
    text-decoration:none;
}
.box{
    display: flex;
    
    background: rgb(209, 238, 205);
    margin-top: 150px;
    border: 2px solid black;
}
.box1{
    display: flex;
    margin-top: 20;
    
}
.para{
    margin-top: 30px;
}
.title{
    font-size: 70px;
    font-family:fantasy;
    text-align: center;
    color: rgb(1, 5, 17);
    font-variant: small-caps;
    letter-spacing: 12px;
}
.button{
    width: 150px;
    height: 30px;
    border: 1px solid green;
    border-radius: 10px;
    color: rgb(1, 8, 17);
    font-weight: bold;
    background-color: rgb(182, 240, 174);
}
.but:hover{
    width: 150px;
    height: 30px;
    box-shadow: 0 0 10px 3px #0ae40a;
    border-radius: 10px;

}


/*---------------------header-----------------------------------------*/

*{
	margin: 0;
	padding: 0;
	list-style: none;
	text-decoration: none;
	font-family: sans-serif;
  }
  nav .logo{
	color: white;
	font-size: 33px;
	font-weight: bold;
	line-height: 70px;
	padding-left: 110px;
  }
  nav{
	height: 70px;
	background: #063247;
	box-shadow: 0 3px 15px rgba(0,0,0,.4);
  }
  nav ul{
	float: right;
	margin-right: 30px;
  }
  nav ul li{
	display: inline-block;
  }
  nav ul li a{
	color: white;
	display: block;
	padding: 0 15px;
	line-height: 70px;
	font-size: 20px;
	background: #063247;
	transition: .5s;
  }
  nav ul li a:hover,
  nav ul li a.active{
	color: #23dbdb;
  }
  nav ul ul{
	position: absolute;
	top: 85px;
	border-top: 3px solid #23dbdb;
	opacity: 0;
	visibility: hidden;
  }
  nav ul li:hover > ul{
	top: 70px;
	opacity: 1;
	visibility: visible;
	transition: .3s linear;
  }
  nav ul ul li{
	width: 150px;
	display: list-item;
	position: relative;
	border: 1px solid #042331;
	border-top: none;
  }
  nav ul ul li a{
	line-height: 50px;
  }
  nav ul ul ul{
	border-top: none;
  }
  nav ul ul ul li{
	position: absolute;
	top: -70px;
	left: 150px;
  }
  nav ul ul li a i{
	margin-left: 45px;
  }

/*------------------fotter-----------------------------------------*/

  @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');

*{
	margin:0;
	padding:0;
	box-sizing: border-box;
}
.container{
	max-width: 1170px;
	margin:auto;
}
.row{
	display: flex;
	flex-wrap: wrap;
}
ul{
	list-style: none;
}
.footer{
	background-color: #24262b;
    padding: 70px 0;
	margin-top: 100px;
	line-height: 1.5;
	font-family: 'Poppins', sans-serif;
}
.footer-col{
   width: 25%;
   padding: 0 15px;
}
.footer-col h4{
	font-size: 18px;
	color: #ffffff;
	text-transform: capitalize;
	margin-bottom: 35px;
	font-weight: 500;
	position: relative;
}
.footer-col h4::before{
	content: '';
	position: absolute;
	left:0;
	bottom: -10px;
	background-color: #e91e63;
	height: 2px;
	box-sizing: border-box;
	width: 50px;
}
.footer-col ul li:not(:last-child){
	margin-bottom: 10px;
}
.footer-col ul li a{
	font-size: 16px;
	text-transform: capitalize;
	color: #ffffff;
	text-decoration: none;
	font-weight: 300;
	color: #bbbbbb;
	display: block;
	transition: all 0.3s ease;
}
.footer-col ul li a:hover{
	color: #ffffff;
	padding-left: 8px;
}
/*.footer-col .social-links a{
	display: inline-block;
	height: 40px;
	width: 40px;
	background-color: rgba(255,255,255,0.2);
	margin:0 10px 10px 0;
	text-align: center;
	line-height: 40px;
	border-radius: 50%;
	color: #ffffff;
	transition: all 0.5s ease;
}
.footer-col .social-links a:hover{
	color: #24262b;
	background-color: #ffffff;
}*/

/*responsive*/
@media(max-width: 767px){
  .footer-col{
    width: 50%;
    margin-bottom: 30px;
}
}
@media(max-width: 574px){
  .footer-col{
    width: 100%;
}
}
.par{
	color: #bbbbbb;
}





</style>
</head>
<body>
    <!---------------------------header start--------------------->
    <header>
        <nav>
            <label class="logo">GroceryPro</label>
            <ul>
               <li><a class="active" href="home logout.jsp">Home</a></li>
               <li>
                  <a href="category.jsp">Category</a>
               </li>
               <li>
                  <a href="#">Deals
                  <i class="fas fa-caret-down"></i>
                  </a>
                  <ul>
                     <li><a href="#">Offers</a></li>
                     <li><a href="#">Flash Sale</a></li>
                     <li><a href="#">Others</a></li>
                  </ul>
               </li>
               <li><a href="#">Contact</a></li>
		   <li>
			<a href="#">My Account
				<i class="fas fa-caret-down"></i>
			</a>
			<ul>
				<li><a href="Profile.jsp">Profile</a></li>
				<li><a href="Login.jsp">log out</a></li>
				<li>
			</li>
			</ul>
			</li>
                <li><a href="#">Feedback</a></li>
            </ul>
         </nav>
    </header>
    <!---------------------------header end----------------------->

<!-----------------------------category--------------------------------->
<div class="box">
<div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/download.jpg" class="item-image">
                <div class="img-title">Kulubadu</div>
            </div>
        </a>
</div>
<div class="container1">
    <a href="#">
        <div class="category">
            <img src="img/images (3).jpg" class="item-image">
            <div class="img-title">bevarage</div>
        </div>
    </a>
</div>
<div class="container1">
    <a href="#">
        <div class="category">
            <img src="img/images (1).jpg" class="item-image">
            <div class="img-title">sop</div>
        </div>
    </a>
</div>
<div class="container1">
    <a href="#">
        <div class="category">
            <img src="img/images.jpg" class="item-image">
            <div class="img-title">fruits</div>
        </div>
    </a>
</div>
</div>
<!-----------------------------categtory end--------------------------------->
<div class="para">
    <div class="title">Kulubadu</div>
</div>

<div class="box1">
    <div class="container1">
            <a href="#">
                <div class="category">
                    <img src="img/download.jpg" class="item-image">
                    <div class="img-title1">Kulubadu</div>
                </div>
            </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (3).jpg" class="item-image">
                <div class="img-title1">bevarage</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (1).jpg" class="item-image">
                <div class="img-title1">sop</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images.jpg" class="item-image">
                <div class="img-title1">fruits</div>
            </div>
        </a>
    </div>
</div>
<div class="container1">
    <a href="#">
        <div class="category">
            <img src="img/images.jpg" class="item-image">
        <div class="img-title1">fruits</div>
        </div>
    </a>
</div>

<center><div class="but"><input type="button" class="button" value="Shop more>>"></div></center>
<div class="para">
    <div class="title">Bevarages</div>
</div>

<div class="box1">
    <div class="container1">
            <a href="#">
                <div class="category">
                    <img src="img/download.jpg" class="item-image">
                    <div class="img-title1">Kulubadu</div>
                </div>
            </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (3).jpg" class="item-image">
                <div class="img-title1">bevarage</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (1).jpg" class="item-image">
                <div class="img-title1">sop</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images.jpg" class="item-image">
                <div class="img-title1">fruits</div>
            </div>
        </a>
    </div>
</div>
<div class="container1">
    <a href="#">
        <div class="category">
            <img src=img/images.jpg" class="item-image">
        <div class="img-title1">fruits</div>
        </div>
    </a>
</div>

<center><div class="but"><input type="button" class="button" value="Shop more>>"></div></center>

<div class="para">
    <div class="title">Personal Care</div>
</div>

<div class="box1">
    <div class="container1">
            <a href="#">
                <div class="category">
                    <img src="img/download.jpg" class="item-image">
                    <div class="img-title1">Kulubadu</div>
                </div>
            </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (3).jpg" class="item-image">
                <div class="img-title1">bevarage</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (1).jpg" class="item-image">
                <div class="img-title1">sop</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images.jpg" class="item-image">
                <div class="img-title1">fruits</div>
            </div>
        </a>
    </div>
</div>
<div class="container1">
    <a href="#">
        <div class="category">
            <img src="img/images.jpg" class="item-image">
        <div class="img-title1">fruits</div>
        </div>
    </a>
</div>

<center><div class="but"><input type="button" class="button" value="Shop more>>"></div></center>

<div class="para">
    <div class="title">Snack & Confectionery</div>
</div>

<div class="box1">
    <div class="container1">
            <a href="#">
                <div class="category">
                    <img src="img/download.jpg" class="item-image">
                    <div class="img-title1">Kulubadu</div>
                </div>
            </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images (3).jpg" class="item-image">
                <div class="img-title1">bevarage</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img//images (1).jpg" class="item-image">
                <div class="img-title1">sop</div>
            </div>
        </a>
    </div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images.jpg" class="item-image">
                <div class="img-title1">fruits</div>
            </div>
        </a>
    </div>
</div>
    <div class="container1">
        <a href="#">
            <div class="category">
                <img src="img/images.jpg" class="item-image">
            <div class="img-title1">fruits</div>
            </div>
        </a>
    </div>
<center><div class="but"><input type="button" class="button" value="Shop more>>"></div></center>


<!--------------------fotter start------------------------>
<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="footer-col">
                <h4>company</h4>
                <ul>
                    <li><a href="#">about us</a></li>
                    <li><a href="#">our services</a></li>
                    <li><a href="#">privacy policy</a></li>
                    <li><a href="#">affiliate program</a></li>
                </ul>
            </div>
            <div class="footer-col">
                <h4>get help</h4>
                <ul>
                    <li><a href="#">FAQ</a></li>
                    <li><a href="#">shipping</a></li>
                    <li><a href="#">returns</a></li>
                    <li><a href="#">order status</a></li>
                    <li><a href="#">payment options</a></li>
                </ul>
            </div>
            <div class="footer-col">
                <h4>online shop</h4>
                <ul>
                    <li><a href="#">watch</a></li>
                    <li><a href="#">bag</a></li>
                    <li><a href="#">shoes</a></li>
                    <li><a href="#">dress</a></li>
                </ul>
            </div>
            <div class="footer-col">
                <h4>follow us</h4>
                    <p class="par">fksnkjdsnjkdskjfds</p>
                </div>
            </div>
        </div>
</footer>

<!--------------------fotter start------------------------>
</body>
</html>