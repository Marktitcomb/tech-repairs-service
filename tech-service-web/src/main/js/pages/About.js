const React = require("react");

function About(){
    return(
        <div className="about">
            <div className="container">
                <div class="row align-items-center my-5">
                    <div className="col-lg-7">
                        <img
                            class="img-fluid rounded mb-4 mb-lg-0"
                            src="http://placehold.it/900x400"
                            alt=""
                        />
                    </div>
                    <div class="col-lg-5">
                        <h1 class="font-weight-light">About</h1>
                        <p>
                            This site is used to help manage your clients and bookings...
                        </p>
                    </div>
                </div>
            </div>
        </div>
    );
}
export default About;