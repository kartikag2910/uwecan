import React from 'react'
import Login from './pages/Login'
import { Routes,Route,BrowserRouter } from 'react-router-dom'
import Home from './pages/Home'


export default function App() {
  return (
    <>
   
    <div className="App"> 
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<Home/>}/>
    <Route path="/login" element={<Login/>}/>
    </Routes>

    </BrowserRouter>
    </div>
    </>
  )
}
