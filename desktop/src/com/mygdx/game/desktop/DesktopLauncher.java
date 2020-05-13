package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MyGdxGame(), config);
	}
}


// commit guardar cambios (localmente)
// push mandar nuevo codigo (se manda con todos los cambios)
// pull sacar un proyecto existente
// import from vcs o clone sacar un proyecto existente
// merge combinar branches
//XD
// L O L
// le zas

