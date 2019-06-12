# Lab 11: Spring for Full-Stack Web Apps
> Today, you’ll set up a basic webapp that will be useful for the next 5 labs.

## Summary
> Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data come back.

> Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get the response THIS IS KINDA CAPITALIZED.

> Create a route that reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return world Hello.


## Setup
1. Clone the repo.
2. Install gradle.
3. Build the repo via ./gradlew build.
4. Start the server via .gradlew bootRun
5. Navigate to the /capitalize or /reverse route.
6. Enter a string.
    1. If on the /reverse route, be sure to enter your string as a parameter, ie /reverse?sentence=Enter sentence here
7. Watch in wonder as your sentence is manipulated.