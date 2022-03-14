

---integrating react

react overview far

1. import all your stuff ...  import or require doesnt matter
    const React = require('react');
    const ReactDOM = require('react-dom');

    import { NavLink } from "react-router-dom";
    import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

2. You have one main page... here we use main but lots of tutorials use index

3. At the bottom of the main page is where you link to the index.html page
    (Dom represents the html page)
    ReactDOM.render(
        <Router>
            <App /> //name of the main connecting class/function
            <Routes>
                <Route path="/home" element={<Home />} /> //rout to the home page
            </Routes>
        </Router>,
        document.getElementById('react') // this is the name 'react' which connects it to the index page
    );

 4. exporting the function was easy -> export default Navigation; after the function
                                    -> then you need the index.js in a sep directory with... export { default as Home } from "./Home";

    exporting the class was not... it can still be done but you may also need the index.js to export as well


 5. the refresh erro problem
        With the default strategy (HTML5 history API) of routing, you need a server configuration to redirect all your paths to your
        HTML entry point file. With the hashbang approach it's not necessary...
        If you want to switch to this approach, simply use the following code:


2   I had a similar issue WhiteLabel Error message on my Angular SPA whenever I did a refresh.
    If you don't want to change the app URL (which will happen if you use HashLocation Strategy),
    you could add a new controller to handle the White label Error mapping in your Spring Boot app.

    The fix was to create a controller that implements ErrorController and return a ModelAndView object that forwards to /

    this was found to be a spring boot issue and server.error.whitelabel.enabled=false can solve this too

    BASICALLY!!! when using spring boot it'll want to take you to different URLs, like you've seen previously with thymleaf projects.
    Here however, we always want to be taken back to the html entry point as react is sorting the urls for us. Springboot always
    wants to hit the index page!

6. WhiteLabel Error Page

   WhiteLabel Error Page is a generic Spring Boot error page that is displayed when no custom error page is present.