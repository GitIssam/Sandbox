Organisation du Code
Le projet Android est organisé selon une architecture MVVM (Modèle-Vue-VueModèle), qui sépare clairement les responsabilités de chaque composant.
Voici la structure du projet :

UI: Ce package contient toutes les classes liées à l'interface utilisateur de l'application.
Il est divisé en sous-packages pour chaque écran ou composant d'écran.
screens: Contient les écrans principaux de l'application.
Components: Comprend les composants réutilisables de l'interface utilisateur, tels que les cartes etc.
Domain: Contient les modèles de données de l'application, ainsi que toute la logique métier.
Data: Gère les données.
Utils: Contient les classes utilitaires réutilisables dans toute l'application.
Architecture MVVM
Modèle: Le package domain contient les modèles de données de l'application, tels que les classes Character et Episode.
Vue: Les écrans et les composants d'interface utilisateur sont définis dans le package ui. Chaque écran a sa propre classe Composable qui définit sa structure et son apparence.
VueModèle: Les classes ViewModel sont situées dans le package ui.screens et sont responsables de fournir des données à l'interface utilisateur et de gérer l'état de l'écran. Elles interagissent avec les couches de données et exposent des états.
Utilisation des Managers
Son et Vibration: Les fonctionnalités de son et de vibration sont gérées par des managers dans le package utils. Ces managers encapsulent les fonctionnalités liées au son et à la vibration et sont invoqués à partir des composants d'interface utilisateur lorsqu'ils sont nécessaires.
