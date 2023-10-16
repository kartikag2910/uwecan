import React from 'react'
import "./Home.css";
import { useNavigate } from 'react-router-dom';

export default function Home() {
    const navigate=useNavigate();
    const handleClick=()=>{
        navigate("/login")
    }
  return (
    <div className='home'>
    <div className="container1">
    <img src="images/backgroundimg.png" alt="" className="backgroundImg" />
    <h3 className='heading'>Let's Make The World Better Place</h3>
    <div className="btns">
    <button className='btn1' onClick={handleClick}>Donate</button>
    <button className='btn2'>Seek Help</button>
    </div>
    </div>
    </div>
  )
}
