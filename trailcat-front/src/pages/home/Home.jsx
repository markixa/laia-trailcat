import React from 'react'
import './Home.css'

export default function Home() {
  return (
    <div className='container'>
      <h1>Welcome to Trailcat</h1>
      <h2>This page is under construction</h2>
      <div className="user-table">
        <p>Users available</p>
        <p>username / password</p>
        <p>johndoe / doepass (Role: user)</p>
        <p>admin / admin (Role: admin)</p>
      </div>
    </div>
  )
}
