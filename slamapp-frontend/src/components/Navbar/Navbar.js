import React, { useEffect, useState } from "react";
import "./Navbar.css";
import { Link } from "react-router-dom";

export const Navbar = () => {
    const [isShowLogin, setIsShowLogin] = useState(true);

  const handleLoginClick = () => {
    setIsShowLogin((isShowLogin) => !isShowLogin);
  };
  return (
    <header className="header">
      <nav className="navbar-component">
        <div id="logo-container">
            <h1>Slam<strong>!</strong></h1>
          {/* Have image logo here */}
          {/* <img className="img-logo" id="img-logo-spacer" src={logoSpacer} alt="" />
          <img className="img-logo" id="img-logo-text" src={logoText} alt="" /> */}
          {/* <div id="nav-search">
            <input id="search-bar" type="text" placeholder="Search" />
          </div> */}
        </div>
        <div className="nav-links-container">
          <div className="nav-links">
            {" "}
            <Link to={`/`}>Home</Link>
          </div>
          <div className="nav-links" id="discover-link">
            <Link to={`/discover`}>Discover</Link>
          </div>

          <button onClick={handleLoginClick} className="nav-links loginicon">Login</button>
          {/* Your other content */}
          {/* <div className="nav-links" id="profile-container">
              <div id="profile" className="nav-links">
                {userString ? (
                  <div onClick={handleOpenMenu}>{user?.firstName}</div>
                ) : (
                  <div onClick={navigateToLogin}>Login</div>
                )}
                <div className="dropdown">
                  {loggedInUser.loginResponse || user ? (
                    <>
                      <div
                        onClick={redirectToDashboard}
                        className="dropdown-options"
                      >
                        Dashboard
                      </div>
                      <div className="dropdown-options" onClick={handleProfileClick}>Profile</div>
                      <div
                        id="logout"
                        className="dropdown-options"
                        onClick={handleLogout}
                      >
                        Logout
                      </div>
                    </>
                  ) : (
                    ""
                  )}
                </div>
              </div>
            </div> */}
        </div>
      </nav>
    </header>
  );
};
