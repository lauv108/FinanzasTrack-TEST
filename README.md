FinanzasTrack

FinanzasTrack es una aplicación de consola desarrollada en Java para gestionar finanzas personales. Este proyecto permite registrar usuarios, gestionar transacciones (ingresos y gastos), definir presupuestos, generar reportes financieros y recibir notificaciones y alertas sobre el estado financiero.

Características Principales:

1) Registrar nuevos usuarios.

2) Iniciar sesión para acceder a las funcionalidades de la aplicación.

3) Autenticación de Usuario

4) Registrar transacciones como ingresos y gastos (Próximamente).

6) Generación de Reportes Financieros (Próximamente)


Tecnologías Utilizadas

Lenguaje: Java

Entorno de Desarrollo: Visual Studio Code

Repositorio Público: GitHub

Instalación y Ejecución

Requisitos Previos

Tener instalada la versión más reciente del Java Development Kit (JDK).

Tener instalado Visual Studio Code con la extensión "Extension Pack for Java".

Pasos para Ejecutar el Proyecto

Clonar el repositorio desde GitHub:

git clone <URL-DEL-REPOSITORIO>

Abrir el proyecto en Visual Studio Code.

Compilar y ejecutar la clase principal FinanzasTrack:

javac -d bin src/finanzastrack/FinanzasTrack.java
java -cp bin finanzastrack.FinanzasTrack

Estructura del Proyecto

El proyecto sigue una estructura modular, con clases separadas para cada funcionalidad:

src/
└── finanzastrack/
    ├── Usuario.java            # Clase para manejar datos de usuario
    ├── Autenticacion.java      # Clase para gestionar el registro e inicio de sesión
    ├── Transaccion.java        # (Próximamente) Clase para manejar ingresos y gastos
    ├── Presupuesto.java        # (Próximamente) Clase para definir y gestionar presupuestos
    ├── Reporte.java            # (Próximamente) Clase para generar reportes financieros
    └── FinanzasTrack.java      # Clase principal con el menú interactivo

Funcionalidades Implementadas

Menú Principal: Permite navegar entre las opciones disponibles.

Gestión de Usuarios:

Registrar nuevos usuarios con nombre, correo y contraseña.

Validar credenciales en el inicio de sesión.

Funcionalidades Pendientes

Registro y gestión de transacciones (ingresos y gastos).

Definición de presupuestos y alertas.

Generación de reportes financieros.

Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir:

Realiza un fork del proyecto.

Crea una nueva rama para tu funcionalidad o corrección:

git checkout -b nombre-de-la-funcionalidad

Realiza los cambios y haz un commit:

git commit -m "Descripción de los cambios realizados"

Envía un pull request explicando tus cambios.

Licencia

Este proyecto está bajo la licencia MIT. Puedes consultar el archivo LICENSE para más detalles.

Contacto

Si tienes preguntas o sugerencias sobre el proyecto, por favor contacta a través del repositorio en GitHub.

