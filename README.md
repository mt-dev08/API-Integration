<h1>Backend Project: Java Spring Boot with API Integration</h1>

<p>
    This backend project is built using <strong>Java Spring Boot</strong>, <strong>Spring Data JPA</strong>, and <strong>MySQL</strong>. The primary purpose of this project is to integrate with external APIs provided by a logistics company to manage delivery operations, such as generating airway bills and tracking packages.
</p>

<h2>Project Overview</h2>
<p>
    The project is designed in two different implementations to demonstrate two common approaches for making REST API calls in Spring Boot:
</p>

<ol>
    <li>Using <strong>RestTemplate</strong> to interact with the external API.</li>
    <li>Using <strong>Feign Client</strong> to achieve the same functionality in a more declarative way.</li>
</ol>

<h3>1. RestTemplate Integration</h3>
<p>
    In the first implementation, the project uses <strong>RestTemplate</strong> to make POST requests to the external API endpoints. The process involves:
</p>
<ul>
    <li>Building the request with necessary headers and body data.</li>
    <li>Sending the request and receiving the response using <code>restTemplate.exchange()</code>.</li>
</ul>
<p>
    This approach provides full control over the HTTP requests and is widely used in legacy projects. However, it requires manual configuration of headers, error handling, and request construction.
</p>

<h3>2. Feign Client Integration</h3>
<p>
    The second implementation leverages <strong>Feign Client</strong>, a declarative web service client that simplifies the API call process. With Feign Client, you can define an interface and annotate the API methods. Feign automatically handles request creation, response parsing, and error handling.
</p>
<ul>
    <li>Define the external API endpoint using Feign interface annotations like <code>@FeignClient</code> and <code>@PostMapping</code>.</li>
    <li>Feign Client abstracts away much of the complexity, reducing boilerplate code and improving code readability.</li>
</ul>

<h2>Key Differences</h2>
<p>
    <strong>RestTemplate</strong> is more customizable and provides more granular control over the request/response process. It is preferred in scenarios where custom configurations or advanced HTTP handling is required.
</p>
<p>
    <strong>Feign Client</strong>, on the other hand, is more intuitive and declarative. It automatically handles many aspects of the HTTP communication and is recommended for new projects where simplicity and maintainability are important.
</p>

<h2>Technologies Used</h2>
<ul>
    <li>Java Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>MySQL</li>
    <li>RestTemplate (for one implementation)</li>
    <li>Feign Client (for the other implementation)</li>
</ul>
