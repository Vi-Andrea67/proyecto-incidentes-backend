# Sistema de Gestión de Incidentes - Backend

Backend desarrollado con Spring Boot para la gestión de incidentes.

## Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- Base de datos H2
- REST API

## Funcionalidades

- Crear incidentes
- Consultar todos los incidentes
- Consultar incidente por ID
- Filtrar incidentes por oficina
- Consultar historial de incidentes relacionados
- Manejo de estados del incidente

## Estructura del proyecto
src
└── main
├── java
│ └── com.miproyecto.incidentes
│ ├── controller
│ ├── model
│ └── repository
└── resources

## Ejecución

Clonar el proyecto:


Entrar a la carpeta:


Ejecutar:

Windows:


El servidor inicia en:


## Endpoints principales

Crear incidente:


Listar incidentes:


Buscar por ID:

Historial:


## Base de datos

Se utiliza H2 en memoria.

Consola: http://localhost:8080/h2-console



