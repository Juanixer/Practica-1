# Práctica 1. Obtención de una aproximación iterativa al número pi


# README #

_Este readme sirve como explicación de que he escrito en el código y cuál es el objetivo del mismo._

## Resumen ##
_Con este programa es posible conseguir una aproximación iterativa al numero Pi mediante un método conocido como el método Montecarlo._

## ¿En que consiste el Método Montecarlo? 🍭
_El uso del método de Monte Carlo para aproximar el valor de Pi consiste en dibujar un cuadrado, y dentro de ese cuadrado, dibujar un
círculo con diámetro de igual medida que uno de los lados del cuadrado._

Luego se dibujan puntos de manera aleatoria sobre la superficie dibujada. Los puntos que están fuera del círculo y los que están dentro,
sirven como estimadores de las áreas internas y externas del círculo.


## Requisitos 📋

_Que programas y versiones deberá disponer para ejecutar el programa_

_Lenguaje de programación utilizado:_
```
java version "11.0.12"
```
_Editor de código:_

```
git version 2.33
```

## Comandos para comprobar y ejecutar el programa ⚙️

_En primer lugar se deberá comprobar que compila correctamente mediante el comando que ofrece nuestro makefile.
Tenemos que estar situados en el directorio donde está el makefile_

```
make compilar  
```
_Una vez compilado el archivo y observado que todo funciona bien utilizamos otro comando establecido en el makefile para ejecutar el programa_
```
make ejecutar
```
_Se le preguntará cuantos lanzamientos quiere hacer, tiene que elejir un número alto para que Pi salga con más exactitud,
pero tampoco se ha de elejir un número muy muy alto, ya que saltará una excepcion_


---
## Autor del código:✒️


* **Juan García-Obregón**


## Licencia 📄

Este proyecto está bajo la Licencia Apache License, version 2.0 (The "License")

![](https://www.deividart.com/blog/wp-content/uploads/2020/05/creative-commons-by.jpg)

