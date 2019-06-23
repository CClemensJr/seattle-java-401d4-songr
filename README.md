# Lab 11: Spring for Full-Stack Web Apps
> Today, you’ll set up a basic webapp that will be useful for the next 5 labs.

## Summary
1. Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data come back.
2. Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get the response THIS IS KINDA CAPITALIZED.
3. Create a route that reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return world Hello.

## Setup
1. Clone the repo.
2. Install gradle.
3. Build the repo via ./gradlew build.
4. Start the server via .gradlew bootRun
5. Navigate to the /capitalize or /reverse route.
6. Enter a string.
    1. If on the /reverse route, be sure to enter your string as a parameter, ie /reverse?sentence=Enter sentence here
7. Watch in wonder as your sentence is manipulated.


# Lab 12: Spring RESTful Routing
> Continue working in the same webapp you generated for the previous lab.

## Summary
1. Create an Album model.
  * An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
2. A user should be able to see information about all the albums on the site.
3. A user should be able to add albums to the site.

## Setup
1. Clone the repo.
2. Install gradle.
3. Build the repo via ./gradlew build.
4. Start the server via .gradlew bootRun
5. Navigate to the /albums or /albums/new route.
6. Enter a string.
    1. If on the /new route, enter the appropriate info into the form.
7. Watch in wonder as an album is created.
