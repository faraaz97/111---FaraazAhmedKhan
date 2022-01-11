import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


//toggle image
class ButtonImg extends React.Component
{
  constructor()
  {
    super();
    this.randomHandler = this.randomHandler.bind(this);
    this.a=true;
  }

  randomHandler()
  {
    this.a=!this.a;
    console.log(this.a)
    if(this.a)
    {
      document.getElementById("img").innerHTML="<img src='https://media.istockphoto.com/photos/in-the-hands-of-trees-growing-seedlings-bokeh-green-background-female-picture-id1181366400?k=20&m=1181366400&s=612x612&w=0&h=p-iaAHKhxsF6Wqrs7QjbwjOYAFBrJYhxlLLXEX1wsGs='></img>"
      console.log(this.image)
    }else{
      document.getElementById("img").innerHTML="<img src='https://media.istockphoto.com/photos/monstera-in-a-pot-isolated-on-white-background-close-up-of-tropical-picture-id1278906674?b=1&k=20&m=1278906674&s=170667a&w=0&h=PRsEw9KpsggCTUEqH_DqgtEKRt884wAGfQCQTeS8xBY=' style= 'width=100px height=100px'></img>"
      console.log(this.image)
    }
    
   
  }  

  render()
  {
    return(
    <>
   <div id="img">

   </div>
   <div>
   <button onClick={this.randomHandler}>Button</button>
   </div>
    </>
    );
  }
}

ReactDOM.render(
  <ButtonImg  />,
  document.getElementById("root")
);
