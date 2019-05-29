package org.insa.algo;

import static org.junit.Assert.*;

import org.insa.algo.AbstractInputData.Mode;

import org.insa.algo.CreateTestFile;
import org.insa.algo.ReadTestFile;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class PerformanceTests {
	
	@Test
	public void testAStar() throws IOException {
		CreateTestFile.createTestFile("/home/a_michau/Documents/BE_graphe/test/carre-dense_distance_100_data.txt", "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/carre-dense.mapgr", "carre-dense", 100, Mode.LENGTH);
		ReadTestFile.readTestFile("/home/a_michau/Documents/BE_graphe/test/", "carre-dense_distance_100_data.txt", "/home/commetud/3eme Annee MIC/Graphes-et-Algorithmes/Maps/carre-dense.mapgr");
	}
}
