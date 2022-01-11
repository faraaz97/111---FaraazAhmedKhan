import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//Create a grading component which is accepting 3 subject marks

function Grade(props){

    let CN=parseInt(props.a);
    let DB=parseInt(props.b);
    let web=parseInt(props.c);
    let result = (CN + DB + web)/3;
  
    if(result>90 && result<=100)
    {
      return <h1>Obtained Grade A</h1>
    }
    else if(result>80 && result<=90)
    {
      return <h1>Obtained Grade B</h1>
    }
    else if(result>70 && result<=80)
    {
      return <h1>Obtained Grade C</h1>
    }
    else if(result>60 && result<=70)
    {
      return <h1>Obtained Grade D</h1>
    }
    else{
      return <h2>Student Failed</h2>
    }
  }
  ReactDOM.render(
   
      <Grade a="80" b ="70" c="60" />,
   
    document.getElementById('root')
  );
  