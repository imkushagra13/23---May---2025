This Spring Boot application enables users to compare the 7-day temperature forecast between two cities using the Open-Meteo API
The system works by accepting latitude and longitude coordinates as input, fetching weather data via RestTemplate,
and processing the response to extract temperature values. The project consists of a WeatherForecast class
to store temperature data, a WeatherService class to make API calls, and a WeatherController class to expose REST endpoints.
Users can either request temperature data for a single city or compare temperatures between two cities through a browser or
an HTML form. The application is simple to use—just start the Spring Boot server, enter coordinates into the URL or webpage,
and receive a clear weather forecast. To prevent API errors, the project ensures only valid parameters are used and handles
exceptions gracefully. Whether for travel planning or curiosity, this application provides easy-to-access weather data in
an intuitive way.
