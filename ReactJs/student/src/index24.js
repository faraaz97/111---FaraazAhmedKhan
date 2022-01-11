import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//function based component and class based component difference is -->state
//function based component are stateles
//class based component are stateful

//React Hooks
// technique to use stateful behaviour in function based components
//useState Hook
//Returns a stateful value, and a function to update it.

function MyCalculatorWithHook(props){

  const[first,setFirst] = useState(props.a);
  const[second,setSecond] = useState(props.b);
  const[addition,setAddition] = useState(0);
  const[subtraction,setSubtraction] = useState(0);
  const[multiplication,setMultiplication] = useState(0);
  const[division,setDivision] = useState(0);
  

  const handleAddition = () =>{
    setAddition(parseInt(first)+parseInt(second));
  }
  const handleSubtraction = () =>{
    setSubtraction(parseInt(first)-parseInt(second));
  } 
  const handleMultiplication = () =>{
    setMultiplication(parseInt(first)*parseInt(second));
  }
  const handleDivision = () =>{
    setDivision(parseInt(first)/parseInt(second));
  }
  return(
    <div>
      <p>Addition of {first} and {second} is {addition}</p>
      <button onClick={handleAddition}>Add</button>
      <p>Subtraction of {first} and {second} is {subtraction}</p>
      <button onClick={handleSubtraction}>Subtract</button>
      <p>Multiplication of {first} and {second} is {multiplication}</p>
      <button onClick={handleMultiplication}>Multiply</button>
      <p>Division of {first} and {second} is {division}</p>
      <button onClick={handleDivision}>Divide</button>
    </div>
  );

}

ReactDOM.render(  
  <MyCalculatorWithHook a="30" b="20" /> ,
document.getElementById('root')
);