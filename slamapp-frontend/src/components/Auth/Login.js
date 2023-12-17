import React from 'react'
import GoogleAuth from './GoogleAuth'

export const Login = ({ isShowLogin }) => {
  return (
    <div className={`${isShowLogin ? "active" : ""} show`}>
      <div className="login-form">
        <div className='login-heading'>
            <h3 className='log-header'>Login to Slam!</h3>
            <GoogleAuth />
        </div>
      </div>
    </div>
  )
}
