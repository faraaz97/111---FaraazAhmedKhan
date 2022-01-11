import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//working with style



function MyBorder(props){
  return(
    <div className={'MyBorder MyBorder-'+ props.color}>
      {props.children}
    </div>
  );
}



function MyDialogBox(){
  return(
    <div  onMouseOver={ChangeColor} onMouseOut={RevertColor}>
     
      <MyBorder color="green">
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This is content from First Dialog Box.</p>
      </MyBorder>
      
      <MyBorder color="red">
      
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This is content from First Dialog Box.</p>
        
      </MyBorder>
      <MyBorder color="blue">
      
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This is content from First Dialog Box.</p>
        
      </MyBorder>
    </div>
  );
}
function ChangeColor(props) {
  props.target.style.background = 'yellow';
}
function RevertColor(props){
  props.target.style.background="";
}


ReactDOM.render(  
  <MyDialogBox /> ,
document.getElementById('root')
);