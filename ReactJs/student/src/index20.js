import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Grade extends React.Component
{
  constructor()
  {
    super();
    this.handler = this.handler.bind(this);
    this.state={
      a:"",
      b:"",
      c:"",
      grade:"",
    }
  }
  handler()
  {
    var grade;
    var a= document.getElementById("a").value;
    var b=document.getElementById("b").value;
    var c=document.getElementById("c").value;
    a=parseInt(a);
    b=parseInt(b);
    c=parseInt(c);
    var result=((a+b+c)/3);
   if(result>=90 && result<=100)
   {
     grade="A";
   }else if(result>=70 && result<90)
   {
     grade = "B";
   }else if(result>=50 && result<70)
   {
     grade="C"
   }else{
     grade="Fail"
   }
   this.setState(({
      a:a,
      b:b,
      grade:grade,
   }));
   console.log(grade);
   console.log(result);
  }  

  render()
  {
    return(
    <>
   <table>
     <tr>
   <h1>Grade= {this.state.grade} </h1>
   </tr>
   <tr> <input  id="a" type="number" defaultValue={this.state.a} placeholder='subject1 marks'/></tr>
   <tr> <input  id="b" type="number" defaultValue={this.state.b} placeholder='subject2 marks'/></tr>
   <tr> <input  id="c" type="number" defaultValue={this.state.c} placeholder='subject3 marks'/></tr>
   </table>
   <button id="calculate" onClick={this.handler}>GetGrade</button>
    </>
    );
  }
}

ReactDOM.render(
  <Grade />,
  document.getElementById("root")
);
 







