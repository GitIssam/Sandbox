Organisation du Code
Le projet Android est organisé selon une architecture MVVM (Modèle-Vue-VueModèle), qui sépare clairement les responsabilités de chaque composant. Voici la structure du projet :

Ui: Ce package contient toutes les classes liées à l'interface utilisateur de l'application. Il est divisé en sous-packages pour chaque écran ou composant d'écran.
Screens: Contient les écrans principaux de l'application.
Characterdetails: Comprend l'écran affichant les détails d'un personnage.
EpisodeDetails: Contient l'écran affichant les détails d'un épisode.
Components: Comprend les composants réutilisables de l'interface utilisateur, tels que les cartes pour les épisodes (EpisodeCard), les boutons, etc.
Domain: Contient les modèles de données de l'application, ainsi que toute la logique métier.
Models: Contient les classes de données, telles que Character et Episode.
Data: Gère l'accès aux données
SoundManager: Gère la lecture des effets sonores.
VibrationManager: Gère les vibrations de l'appareil.
Architecture MVVM
Modèle (Model): Le package domain contient les modèles de données de l'application, tels que les classes Character et Episode.
Vue (View): Les écrans et les composants d'interface utilisateur sont définis dans le package ui. Chaque écran a sa propre classe Composable qui définit sa structure et son apparence.
VueModèle (ViewModel): Les classes ViewModel sont situées dans le package ui.screens et sont responsables de fournir des données à l'interface utilisateur et de gérer l'état de l'écran. Elles interagissent avec les couches de données et exposent des états observables pour les composants d'interface utilisateur.
Utilisation des Managers
Son et Vibration: Les fonctionnalités de son et de vibration sont des managers qui encapsulent les fonctionnalités liées au son et à la vibration et sont invoqués à partir des composants d'interface utilisateur lorsqu'ils sont nécessaires. => Utils
