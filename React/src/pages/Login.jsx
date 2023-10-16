import React from 'react'
import './Login.css'

export default function Login() {
  return (
    <div className='login'>
      <div className="container">
        <div className="loginLeft">
          <h3 className="loginLogo">uWeCan</h3>
          <span className="loginDesc">Together we can make this world a better place to live.</span>
        </div>
        <div className="loginRight">
          <div className="loginBox">
            <input type="text" placeholder="Enter your name" className="loginInput" />
            <input type="text" placeholder='Enter your adress' className="loginInput" />
            <input type="number" placeholder='Enter you contact number' className="loginInput" />
            <label className='loginInput'>what do you want to Donate?
            <select name="" id="" className='selector' >
              <option value="Medicine">Medicine</option>
              <option value="Clothes">Clothes</option>
              <option value="Food">Food</option>
              <option value="devices">Medical Devices</option> 
            </select>
            </label>
         
          <button className="submitButton">
            Submit
          </button> 
          </div>
        </div>
      </div>
    </div>
  )
}
