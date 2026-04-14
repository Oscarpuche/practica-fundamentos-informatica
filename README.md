# Antes de comenzar
Bienvenid@ al proyecto de la asignatura de Fundamentos de Informática de la Escuela Técnica Superior de Ingenieros Industriales de la UNED.
El objetivo de esta práctica es desarrollar la estructura o backend de una 'red social', donde podamos pasarle información al sistema sobre usuarios, su información personal y escribir post asociados a sus perfiles.

# Estructura del proyecto
El espacio de trabajo contiene tanto el documento .pdf con las instrucciones de la práctica para el curso 2025-2026, así como la carpeta `src` donde se encuentran todos los archivos del proyecto.\
La estructura del proyecto se encapsula en tres etapas diferenciadas cuyo procedimiento y resultado resultan jerárquicas. En cada una de las etapas se ha ido definiendo el sistema completo desde las clases más simples hasta
las funcionalidades de red más complejas.\
Aunque no se incluye cada una de las etapas por separado, sino el proyecto global, es importante definir cada uno de los estados intermedios:
- Etapa 1: Definición de clases Perfil y Biografía, así como la relación de composición entre ambas.
- Etapa 2: Definición de las clases MiRed y Post, así como la gestión interna de perfiles y publicaciones por parte del sistema.
- Etapa 3: Definición de la clase PerfilProfesional, así como la herencia de clases.
  
Se incluye además una carpeta con todos los archivos `.puml` correspondientes a los diferentes diagramas de clases en cada etapa.
<!-- Se hará uso de la carpeta `bin` para almacenar todos los archivos compilados. -->  

# Información adicional
Si trabajas con BlueJ, puedes descargar en una carpeta todos los archivos .java, e importarlos directamente usando la opción 'Proyecto No BlueJ' en el menú 'Proyecto'.

<img width="487" height="272" alt="image" src="https://github.com/user-attachments/assets/aa10e41f-19ad-4367-a127-26a0a9cbdaf7" />

Por otro lado, para la generación de los diagramas de clase se ha usado una combinación de [Graphviz](https://graphviz.org/) y [PlantUML](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml), de forma que obtengamos figuras como esta:

<img width="433" height="603" alt="diagramaetapa2" src="https://github.com/user-attachments/assets/fca33982-d291-4b35-8e86-2fe5f934ce0e" />
