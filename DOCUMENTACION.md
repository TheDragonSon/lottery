# **Loteria de fin de semana**
## Solución al ejercicio 

El día jueves se dio a conocer el #RigoChallenge :sunglasses: dónde se planteaba el siguiente problema: 
[Parte 1] (https://ibb.co/eUGm09)
[Parte 2] (https://ibb.co/hxdMYU)

El .java de la solución es el que dice Solución 

Y la solución después de entenderlo fue la siguiente: 
1. Crear el código para recibir los números N, C, K 
* Estos números deben cumplir ciertas condiciones para ser aceptados: 
* Deben ser positivos, mayores a cero. 
* N no debe ser mayor a 10,000.
* C debe ser menor o igual a 10. 
* K debe ser mayor a C y menor o igual que 100. 


2. Mientras N, C, y K no fueran cero, se entra a un while dónde se tiene lo siguiente: 
* Tenemos un contador[101] ¿y por qué 101? este arreglo nos servirá para contar las veces que se repite un número
(el cual manejaremos como la posición), y puede haber del 2 al 100, ya que el valor minimo de C es 1, entonces el 
valor mínimo de K es 2. Y, tenemos la posición del 1 y del 0 en el array,  por eso son 100+1 (la posición del 0). 
* Creamos una variable auxiliar llamada min (mínimo) y la inicializamos con el valor máximo que puede repetirse 
un número, el cual es N. 
* La variable random se llama así porque en mi primer solución esos números no eran entrada síno que yo los generaba
con la función random, y así le deje el nombre. Pero representa los números de entrada. 

3. La solución se basa en ciclos for, y en if´s. 

Sé que debe haber una forma más compacta de resolverlo, y aún me falta validar que las entradas en un sólo sorteo no sean números
repetidos. ¡LO HARÉ MÁS TARDE! :wink:
Tengo que ir a trabajar :bowtie:
