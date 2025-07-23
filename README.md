postgreSql 15
spring 3.1.1
spring doc 2.1.0
swagger 2.2.22
lombok 1.18.32

``<dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.1.0</version>
        </dependency>
        <dependency>
            <groupId>io.swagger.core.v3</groupId>
            <artifactId>swagger-core</artifactId>
            <version>2.2.22</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.32</version> <!-- หรือเวอร์ชันล่าสุด -->
            <scope>provided</scope>
        </dependency>
``

The controller receives the data and sends it to the service via the addUser, adds the value to the entity, and then checks the data to see if the user id and token id are empty. If empty, it sends an error back or saves it to the database.

swagger link: ``http://localhost:8080/apitest/swagger-ui.html``
