# AS-DAM-ACT1EVA1
#  Aplicación Android: Formulario de Datos Personales

## Descripción general
Este proyecto consiste en una aplicación Android desarrollada en **Android Studio**, cuyo objetivo es permitir al usuario introducir sus datos personales (nombre, edad y correo electrónico) a través de un formulario.

La aplicación **valida los datos introducidos** y, en caso de ser correctos, muestra una segunda pantalla donde se presentan los resultados de forma ordenada junto con un mensaje de confirmación.

---

## Pasos para abrir y ejecutar el proyecto

### 1. Abrir el proyecto
1. Iniciar Android Studio.  
2. Seleccionar la opción File > Open...  
3. Buscar y abrir la carpeta que contiene el proyecto.

### 2. Verificar las dependencias
- Comprobar que el SDK de Android esté correctamente instalado.  
- Asegurarse de que el archivo build.gradle no presente errores.

### 3. Ejecutar la aplicación
1. Conectar un dispositivo Android físico o iniciar un emulador desde el *AVD Manager*.  
2. Pulsar el botón Run para compilar y ejecutar la aplicación.

---

## Capturas de pantalla

Guarda las capturas en una carpeta llamada `screenshots` dentro del proyecto y añádelas así:

1. **Pantalla Principal (`MainActivity`):**  
   ![MainActivity](../screenshots/main_activity.png)[README.md](README.md)

2. **Pantalla de Presentación (`PresentacionActivity`):**  
   ![PresentacionActivity](../screenshots/presentacion_activity.png)

3. **Pantalla de Formulario (`FormularioActivity`):**  
   ![FormularioActivity](../screenshots/formulario_activity.png)

4. **Mensaje de Envío Exitoso:**  
   ![Formulario Enviado](../screenshots/formulario_enviado.png)



## Explicación de las validaciones implementadas

En la pantalla del formulario, antes de enviar los datos y acceder a la siguiente actividad, se aplican las siguientes validaciones:

- **Campo Nombre:** no puede estar vacío.  
- **Campo Correo electrónico:** debe incluir el carácter `@` y tener un formato válido (por ejemplo: `usuario@correo.com`).  
- **Campo Mensaje:** no puede estar vacío.  

Si algún campo no cumple las condiciones, la aplicación muestra un **mensaje de advertencia (Toast)** indicando el error correspondiente y no permite avanzar hasta que todos los datos sean válidos.

---

## Diseño e interfaz de usuario

- **Pantalla inicial:** muestra un logotipo centrado y un botón que permite acceder al formulario.  
- **Pantalla de formulario:** incluye los campos de entrada (nombre, edad y correo) junto con un botón de envío.  
- **Pantalla de resultados:** presenta los datos enviados y un mensaje confirmando que el envío se ha realizado correctamente.  

El diseño utiliza **ConstraintLayout** para mantener una estructura adaptable a diferentes tamaños de pantalla, junto con el tema **Material 3 (`Theme.Material3`)** para ofrecer una apariencia moderna y coherente con las guías de diseño de Android.

---

## Icono de la aplicación
La aplicación incluye un **icono personalizado**, configurado mediante el asistente **Image Asset** de Android Studio, que sustituye al icono predeterminado del sistema.  
Este icono aparece tanto en el menú del dispositivo como en la pantalla de carga inicial de la aplicación.

---

## Información del proyecto

- **Nombre:** Alejandro del Valle López  
- **Curso:** 2º DAM  
- **Asignatura:** Programación Multimedia y Dispositivos Móviles (PMDM)
