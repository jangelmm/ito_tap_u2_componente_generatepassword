# `Generate Password`
## Información
**Tópicos Avanzados de Programación - SCD 1027**
**Ingeniería en Sistemas Computacionales**


**Autores**
- Martínez Mendoza Jesús Ángel
- Diego García Jennifer

**Docente:** Martínez Nieto Adelina

**Grupo:** 4SA

**Hora:** 12:00 - 13:00 hrs.

**Periodo:** Ene/Jun 2024


**Proyecto**
- Componente para generar contraseñas
  
**Versión:** 2.0
**Fecha:** Abril, 2024

## Descripción
### Descripción del Componente

El componente desarrollado consta de dos clases principales, `SecurePasswordGenerator` y `GeneratePassword`, diseñadas para trabajar conjuntamente con el objetivo de generar contraseñas seguras y gestionar su interacción con el usuario a través de una interfaz gráfica.

- **SecurePasswordGenerator**: Esta clase se encarga de la lógica de generación de contraseñas. Utiliza un enfoque basado en la seguridad, combinando caracteres alfanuméricos y símbolos, dependiendo de las preferencias del usuario. La generación de contraseñas se realiza mediante el uso de `SecureRandom`, lo que garantiza que las contraseñas generadas sean difíciles de predecir y seguras. La clase permite configurar la longitud de la contraseña y si incluir o no números y símbolos.

- **GeneratePassword**: Esta clase proporciona una interfaz gráfica de usuario (GUI) implementada como un `JPanel`. Permite a los usuarios seleccionar opciones de generación de contraseña, como la longitud y la inclusión de números o símbolos. Además, incluye botones para iniciar la generación de la contraseña, copiar la contraseña al portapapeles y resetear el campo de visualización de la contraseña. También ofrece la posibilidad de enviar la contraseña generada a un campo de texto externo, facilitando la integración con otras partes de una aplicación más amplia.

### Posibles Usos

1. **Aplicaciones de Gestión de Usuarios**: El componente puede ser integrado en sistemas de gestión de usuarios donde se requiera la creación de contraseñas seguras para nuevos usuarios o para el reseteo de contraseñas existentes.

2. **Herramientas de Seguridad**: Podría ser utilizado como parte de una herramienta de seguridad más amplia que ofrezca funcionalidades como la gestión de contraseñas, auditorías de seguridad, o como un módulo en una suite de seguridad informática.

3. **Aplicaciones Web y Móviles**: Integración en aplicaciones web o móviles que requieran una alta seguridad en el manejo de contraseñas, como aplicaciones bancarias, comercio electrónico, o plataformas que manejen información sensible.

4. **Herramientas de Desarrollo de Software**: Como un plugin o extensión en entornos de desarrollo, ayudando a los desarrolladores a generar contraseñas seguras para uso en configuraciones de base de datos, archivos de configuración, y más.

El componente está diseñado para ser flexible y fácilmente integrable en diversas aplicaciones Java, proporcionando una solución robusta y segura para la generación de contraseñas que cumplan con criterios de seguridad actuales.

## API
### SecurePasswordGenerator

#### Descripción
La clase `SecurePasswordGenerator` es responsable de generar contraseñas seguras basadas en parámetros específicos como longitud, inclusión de símbolos y números. Utiliza un enfoque aleatorio seguro para garantizar que las contraseñas generadas sean difíciles de predecir.

#### Campos
| Tipo | Campo | Descripción |
|------|-------|-------------|
| `String` | `LOWER` | Contiene las letras minúsculas de la A a la Z. |
| `String` | `UPPER` | Contiene las letras mayúsculas de la A a la Z. |
| `String` | `DIGITS` | Contiene los dígitos del 0 al 9. |
| `String` | `PUNCTUATION` | Contiene símbolos comunes utilizados en contraseñas. |

#### Métodos
| Nombre | Tipo de Dato que Retorna | Tipo de dato que recibe | Descripción |
|--------|--------|-------------------------|-------------|
| `SecurePasswordGenerator` | `String` | `int length, boolean includeSymbols, boolean includeNumbers` | Genera una contraseña segura basada en la longitud especificada y la inclusión opcional de símbolos y números. |

---

### GeneratePassword

#### Descripción
`GeneratePassword` es un componente GUI diseñado como un `JPanel` que permite a los usuarios generar contraseñas seguras visualmente. Incluye opciones para copiar la contraseña al portapapeles y transferir la contraseña a un campo de texto externo mediante el uso de métodos específicos.

#### Campos
| Tipo | Campo | Descripción |
|------|-------|-------------|
| `javax.swing.JTextField` | `externalTextField` | Campo de texto externo para recibir la contraseña generada. |

#### Constructores
| Constructor | Descripción |
|-------------|-------------|
| `GeneratePassword()` | Inicializa el componente, establece el tamaño y configura los modelos de los componentes del spinner. |

#### Métodos
| Nombre | Tipo de Dato que Retorna | Tipo de dato que recibe | Descripción |
|--------|--------|-------------------------|-------------|
| `setExternalTextField` | `void` | `javax.swing.JTextField externalTextField` | Establece el campo de texto externo donde se mostrará la contraseña generada. |
| `reset` | `void` | | Limpia el texto mostrado en el etiquetado de contraseña. |
| `btnStartActionPerformed` | `void` | `java.awt.event.ActionEvent evt` | Genera una nueva contraseña basada en las preferencias del usuario y actualiza el campo de texto asociado. |
| `btnCopyActionPerformed` | `void` | `java.awt.event.ActionEvent evt` | Copia la contraseña mostrada en el portapapeles del sistema. |
