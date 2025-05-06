package br.com.gilvaneidemedeiros.minhasmusicas.principal;

import br.com.gilvaneidemedeiros.minhasmusicas.modelos.MinhasPreferidas;
import br.com.gilvaneidemedeiros.minhasmusicas.modelos.Musica;
import br.com.gilvaneidemedeiros.minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador(" Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
