
# PRUEBA SEMESTRAL | PROGRAMACIÓN AVANZADA

La entrega consistirá en un programa que el estudiante debe realizar en equipo, en base a la siguiente propuesta, la cual debe entregar, documentar y defender en la fecha estimada *ut-infra*.

---

## Equipo

El estudiante debe formar un equipo de 1 a 3 estudiantes.  
A pesar que un equipo de 1 está mal definido, se aceptará esta opción.

---

## Entrega

El trabajo se debe entregar **ANTES del lunes 28 de julio**.  
La defensa será el **28 de julio**.

---

## Defensa

El docente hace pasar a la clase a los equipos, uno a uno, prueba el programa y les va preguntando a cada integrante:

- ¿Qué hace?
- ¿Para qué sirve?
- ¿Cómo solucionaría los errores del programa presentado?

De manera de verificar:

- El grado de participación en el mismo.
- El nivel de conocimientos de programación.
- Si está preparado para Programación Orientada a Objetos.

> Quien no presente el obligatorio debe ir a APE Diciembre / Febrero.

---

## Reglas

Se acostumbra ajustar la entrega a ciertas reglas como ser:

1. **No se aceptan variables en inglés.**  
   Esto está fundado en estudiantes que buscan soluciones en Internet que están en inglés, la copian tal cual y la presentan.

2. **Los alumnos deben presentar el código del programa impreso**, ya que eso es una documentación del trabajo.  
   Debe figurar los nombres de los integrantes.

3. **Si se detecta el uso de IA** o copia en los trabajos, **quienes copian y quienes se dejaron copiar van a APE Diciembre / Febrero.**

4. **Presentar el obligatorio y presentarse a defenderlo son condiciones para no ir a APE.**

---

## Passwords Aceptables

Un password seguro es algo delicado. Los usuarios prefieren passwords que sean fáciles de recordar (como `amigo`), pero este password puede ser inseguro.

Algunos lugares usan un generador aleatorio de passwords (como `xvtpzyo`), pero los usuarios toman demasiado tiempo recordándolos y algunas veces lo escriben en una nota pegada en su computadora.

Una solución potencial es generar passwords **“pronunciables”** que sean relativamente seguros pero fáciles de recordar.

**UTU está desarrollando un generador de passwords.**

Su trabajo en el departamento de control de calidad es **probar el generador y asegurarse de que los passwords sean aceptables**.  
Para ser aceptable, el password debe satisfacer estas tres reglas:

1. Debe contener **al menos una vocal**.
2. No debe tener **tres vocales consecutivas** o **tres consonantes consecutivas**.
3. No debe tener **dos ocurrencias consecutivas de la misma letra**, excepto por `ee` o `oo`.

> (Para el propósito de este problema, las vocales son `a`, `e`, `i`, `o`, y `u`; todas las demás letras son consonantes).

> Note que estas reglas no son perfectas; habrán muchas palabras comunes/pronunciables que no son aceptables.

---

### Entrada

La entrada consiste en una o más potenciales passwords, uno por línea, seguidas por una línea conteniendo la palabra `'fin'` que señala el fin de la entrada.

Cada password:
- Tiene como mínimo una y como máximo veinte letras.
- Está formado solo por letras en minúscula.

---

### Salida

Por cada password, despliegue si es o no aceptable, usando el formato mostrado en el ejemplo de salida.

---

#### Ejemplo de entrada y salida

```
a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
fin
```

```
<a> es aceptado.
<tv> no fue aceptado.
<ptoui> no fue aceptado.
<bontres> no fue aceptado.
<zoggax> no fue aceptado.
<wiinq> no fue aceptado.
<eep> es aceptado.
<houctuh> es aceptado.
```
