# Sistema de Gestión de Incidentes - Backend

Backend desarrollado con Spring Boot para la gestión de incidentes.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- Base de datos H2 (en memoria)
- REST API

---

## ⚙️ Funcionalidades

- Crear incidentes
- Consultar todos los incidentes
- Consultar incidente por ID
- Filtrar incidentes por oficina
- Consultar historial de incidentes relacionados
- Manejo de estados del incidente

---

## 📁 Estructura del proyecto


src
└── main
├── java
│ └── com.miproyecto.incidentes
│ ├── controller
│ ├── model
│ └── repository
└── resources


---

## 📦 Ejecución del proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/tu-backend.git

2. Entrar a la carpeta
cd tu-backend

3. Ejecutar el proyecto
mvnw spring-boot:run

El servidor inicia en >>
http://localhost:8080

Endpoints principales

(Ajusta estos según tus rutas reales en el controller)

Crear incidente:
POST /incidentes
Listar incidentes:
GET /incidentes
Buscar por ID:
GET /incidentes/{id}
Historial de incidentes:
GET /incidentes/historial
🗄️ Base de datos

Se utiliza H2 en memoria.

Consola H2:
http://localhost:8080/h2-console

Credenciales (si no las cambiaste en application.properties):

JDBC URL: jdbc:h2:mem:testdb
Usuario: sa
Contraseña: (vacía)
