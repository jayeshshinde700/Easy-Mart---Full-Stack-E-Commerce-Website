import React from 'react'
import { Outlet } from 'react-router-dom'
import Navbar from './navbar/Navbar'

export default function Home() {
  return (
   <div>
      <Navbar/>
      <Outlet/>
    </div>
    
  )
}
