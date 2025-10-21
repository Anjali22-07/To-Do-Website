## 📝 To-Do List Web Application
A simple and functional To-Do List web app built using Spring MVC, Spring ORM, and Hibernate, designed to help users manage daily tasks efficiently.

## 🚀 Features
✅ Add new tasks

✏️ Edit existing tasks

❌ Delete tasks

🗃️ Persistent storage with MySQL using Hibernate ORM

🧼 Clean architecture following MVC pattern.

## 🛠️ Tech Stack
Layer	Technology : Backend	Java, Spring MVC
ORM	: Hibernate, Spring ORM
Database : 	MySQL
View	: JSP & HTML & CSS
Build Tool :Maven
Server :	Apache Tomcat 10.1 V

## ⚙️ Setup Instructions

- Clone the repository
  ```  git clone https://github.com/yourusername/todo-webapp.git
        cd todo-webapp
  ```
- Configure your MySQL database
    -- Create a database (e.g. todo_db).
    -- Update xml file with your DB credentials:
  ```
  <!-- DataSource -->
        <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
            <property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
            <property name="url" value="jdbc:mysql://localhost:3306/yourdatabasename"/>
            <property name="username" value="yourUsername"/>
            <property name="password" value="yourPassword"/>
            
        </bean>
        
   <!-- JPA EntityManagerFactory (Hibernate 6) -->
      <bean id="entityManagerFactory" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
          <property name="dataSource" ref="dataSource"/>
          <property name="packagesToScan" value="com.model"/>
          <property name="jpaVendorAdapter">	       
          
              <bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter">
                  <property name="showSql" value="true"/>
                  <property name="generateDdl" value="true"/>
                  <property name="databasePlatform" value="org.hibernate.dialect.MySQL8Dialect"/>
              </bean>
  ```
  - Build and run the project
     -- Using Maven:
  ```
     mvn clean install
  ```
  Deploy to Tomcat or run via your IDE.

- Access the App
    Visit: http://localhost:8080/todo

  ## 📸 Screenshots

   ### Home Page
   ![Home Page](https://raw.githubusercontent.com/Anjali22-07/To-Do-Website/main/Screenshot%20(10).png)

   ### Add Task Modal
  ![Add Task](https://raw.githubusercontent.com/Anjali22-07/To-Do-Website/main/Screenshot%20(11).png)

   ### View Task Modal
   ![Add Task](https://raw.githubusercontent.com/Anjali22-07/To-Do-Website/main/Screenshot%20(9).png)

   ### Update Task Modal
  ![Add Task](https://raw.githubusercontent.com/Anjali22-07/To-Do-Website/main/Screenshot%20(8).png)  




## 💡 Future Improvements
- User authentication and login
- Deadline and reminders
- Task categories and priority tags
- Responsive mobile design

## 🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## 📄 License
 This project is licensed under the MIT License.
 
