Variables que se utilizan en el codigo main: 
- Matriz que contenga las cartas y que indique el nombre y puntaje del jugador
- cartas que se agregan, con dos mazo de cartas por jugador.
- 

Métodos
crearMatrizCartas(): crea una matriz que indica el nombre y el puntaje del jugador. Este metodo usa el método inicializarCartas(), para asi poder agregar las cartas de cada jugador.

agregarCartas(): toma como parametro el nombre de la carta, el puntaje en String y agrega cartas mediante el uso de Random. Retorna la matriz con la carta agregada.

InicializarCartasJuego(): asigna un valor a las cartas que se van a usar durante el juego, toma como parametro la matriz y devuelve una matriz con los nombres de las cartas.

obtenerCartas(): toma como parametro la matriz que contiene las cartas y obtiene un valor aleatorio dentro de las cartas que ya están en la matriz 

jugar(): toma los metódos anteriores y permite que los jugadores saquen sus cartas y puedan ya inicialziar el juego.