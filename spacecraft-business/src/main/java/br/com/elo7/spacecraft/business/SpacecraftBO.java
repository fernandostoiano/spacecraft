package br.com.elo7.spacecraft.business;

import br.com.elo7.spacecraft.model.Plateau;
import br.com.elo7.spacecraft.model.Spacecraft;

public interface SpacecraftBO {

	Spacecraft executeCommands(Plateau plateau, Spacecraft spacecraft);

}
