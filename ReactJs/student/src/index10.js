import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

import reportWebVitals from './reportWebVitals';

//class based components in React
//working with handlers

class Calculator extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {a : parseInt(props.a),b : parseInt(props.b),result:0};
    this.myAdd = this.myAdd.bind(this);
    this.mySubtract = this.mySubtract.bind(this);
    this.myMultiply = this.myMultiply.bind(this);
    this.myDivision = this.myDivision.bind(this);
  }

  myAdd()
  {

    this.setState(i =>(
      {result:i.a+i.b}
    ));
    

  }
  mySubtract()
  {
    this.setState(i =>(
      {result : i.a-i.b}
    ));
    
    
  }

  myMultiply()
  {
    this.setState(i=>(
      {result : i.a*i.b}
    ));
   
  }

  myDivision()
  {
    this.setState(i=>(
      {result : i.a/i.b}
    ));
    
  }

  render()
  {
    return(
    <>
     <h3>Calculation of {this.state.a} and {this.state.b} is:  {this.state.result}  </h3>
     <button onClick={this.myAdd}>Add</button><br></br>

    <button onClick={this.mySubtract}>Subtract</button> <br></br>

   <button onClick={this.myMultiply}>Multiply</button><br></br>
    <button onClick={this.myDivision}>Division</button><br></br>
    
    </>
    );
  }
}

ReactDOM.render(
  <Calculator a="20" b="10"/>,
  document.getElementById("root")
);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();