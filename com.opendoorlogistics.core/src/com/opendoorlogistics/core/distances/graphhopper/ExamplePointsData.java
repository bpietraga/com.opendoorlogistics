/*******************************************************************************
 * Copyright (c) 2014 Open Door Logistics (www.opendoorlogistics.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/lgpl.txt
 ******************************************************************************/
package com.opendoorlogistics.core.distances.graphhopper;
import java.util.Random;

import com.graphhopper.util.shapes.GHPoint;

public class ExamplePointsData {
	final GHPoint[] points;

	protected ExamplePointsData(GHPoint[] points) {
		this.points = points;
	}

	public ExamplePointsData() {
		this(createPoints());
	}

	public GHPoint [] getPoints(){
		return points;
	}
	
	private static GHPoint[] createPoints() {
		return new GHPoint[] { new GHPoint(50.4407112452715, -3.57159398494507), new GHPoint(51.536669159572, 0.131777103342376),
				new GHPoint(55.9289511956161, -3.30222149049984), new GHPoint(52.8003294178197, -0.365005633505327),
				new GHPoint(51.5239154020511, 0.593430947223525), new GHPoint(51.3457998470993, -0.066498010257224),
				new GHPoint(52.4760335183136, 1.05001678159351), new GHPoint(51.3359370070008, -0.821456709574899),
				new GHPoint(52.6216303016115, -2.15901730006681), new GHPoint(51.5038530772809, -0.139151836652053),
				new GHPoint(52.2512369069776, -0.9426445150052), new GHPoint(55.1240913514197, -1.54188974870498),
				new GHPoint(51.5622678236885, 0.162450861378111), new GHPoint(51.9133133962957, -2.04201192972504),
				new GHPoint(57.1487032890387, -2.09780599145205), new GHPoint(51.236024233815, -0.790563849154878),
				new GHPoint(55.7544421466722, -4.69176096194822), new GHPoint(51.2429268702144, 0.671730346332778),
				new GHPoint(53.3213207081814, -1.90481393223615), new GHPoint(51.3633468033129, -0.168468435785571),
				new GHPoint(52.4750590503932, -3.54870343861571), new GHPoint(51.2377028714742, -2.7265005501641),
				new GHPoint(53.6306524272012, -2.165801288327), new GHPoint(53.7977960231347, -1.60938227694284),
				new GHPoint(53.6918638372154, -1.62391643646894), new GHPoint(51.051683863126, -0.414827948693681),
				new GHPoint(50.4448458195496, -4.76105331337923), new GHPoint(56.4689995294959, -2.92248908327687),
				new GHPoint(51.6371274068512, 0.424170381711492), new GHPoint(51.8801724474576, 0.865557959904619),
				new GHPoint(52.401241312871, 0.266826620090329), new GHPoint(56.1641382900286, -3.66843238988752),
				new GHPoint(53.1387036697493, -3.7918385547014), new GHPoint(51.0918702233886, 1.13841640066369),
				new GHPoint(53.4846368220876, -2.32373373760591), new GHPoint(52.463181295735, -0.6137341981683),
				new GHPoint(53.3822916172166, -2.9605099358061), new GHPoint(53.5713398132895, -1.78361707760011),
				new GHPoint(51.7850923408757, -3.2756508606485), new GHPoint(51.7305356100574, 0.707914963875603),
				new GHPoint(53.1594952908737, 0.236309693675243), new GHPoint(51.4091396120304, -3.47521350269049),
				new GHPoint(51.4112463388091, -0.155007856653495), new GHPoint(51.197901082726, -1.72709648648643),
				new GHPoint(52.5906726556138, -2.11797228363766), new GHPoint(52.7189764853423, -3.66467550719869),
				new GHPoint(52.2036914352675, 0.119053989361116), new GHPoint(51.1790021797101, -3.3236700146796),
				new GHPoint(51.4100504497099, 0.0335480501386388), new GHPoint(51.5112487844454, -0.370914127503573),
				new GHPoint(53.2547811277819, -1.90996754351788), new GHPoint(51.4931748893268, -0.128724800775864),
				new GHPoint(55.8730170027713, -3.06054940724414), new GHPoint(54.3657687232757, -2.90542720250129),
				new GHPoint(54.5119904287061, -1.5485447372336), new GHPoint(53.4280659199949, -1.38922756651756),
				new GHPoint(51.1827723815665, 0.211822941521417), new GHPoint(50.8304409155563, -1.08056408088762),
				new GHPoint(54.8998293083696, -1.40280063584278), new GHPoint(50.6310862282576, -4.65036351294079),
				new GHPoint(51.8593780056732, 1.2789124741775), new GHPoint(51.3835942726082, 0.472561653515973),
				new GHPoint(53.5344511496439, -1.17450912175415), new GHPoint(53.2895156944061, -3.6855784366717),
				new GHPoint(51.4950167005381, -0.297403066297355), new GHPoint(51.1275538414608, -3.94300932409819),
				new GHPoint(51.5435581660937, -0.0884555334192896), new GHPoint(52.4657611137163, -1.77265977712475),
				new GHPoint(52.5247632184566, -2.43030861351937), new GHPoint(51.2914167377092, -0.756238616711735),
				new GHPoint(50.2174231684059, -5.18160822762531), new GHPoint(55.859680021602, -4.2403805057704),
				new GHPoint(52.9624528079685, -1.07350000195902), new GHPoint(50.3348647059591, -4.63545085106767),
				new GHPoint(51.8771879482347, 0.0817566544738422), new GHPoint(57.1445181830303, -2.10756126366557),
				new GHPoint(51.4103805056524, -3.255270985398), new GHPoint(53.5850381260148, -2.64019143777353),
				new GHPoint(51.7096065140436, -0.577286975892623), new GHPoint(53.405106491509, -0.773987184840979),
				new GHPoint(51.7285037528865, -1.71682174765155), new GHPoint(54.2898742469764, -0.442371276051675),
				new GHPoint(53.037581158603, -1.20035822297231), new GHPoint(51.7659519244793, -4.53070517173814),
				new GHPoint(51.7942674383336, -3.9926281026492), new GHPoint(50.9976127488236, 0.103326135076887),
				new GHPoint(53.8307574376614, -1.50089628342726), new GHPoint(53.6949659937727, -0.779500438194402),
				new GHPoint(50.835678626435, -0.0865920700628316), new GHPoint(52.4264091811869, 0.756823804373079),
				new GHPoint(51.4814313147623, -0.313102850380516), new GHPoint(55.5209813945455, -4.38223747665944),
				new GHPoint(51.5146912358373, -0.249700044356299), new GHPoint(51.5201850829938, -0.136987110472383),
				new GHPoint(51.0641609174542, -0.334908672994286), new GHPoint(53.6365668840278, -1.84734820294575),
				new GHPoint(51.0173060500704, -3.10673376296508), new GHPoint(51.5008210723334, -0.0865270480997642),
				new GHPoint(50.852244862314, -1.77116547780235), new GHPoint(50.6597314287556, -2.4685152046531) };
	}

	ExamplePointsData(int n){
		Random r = new Random(123);
		points = new GHPoint[n];
		
		// get source points
		GHPoint[] src = createPoints();
		
		for(int i =0 ; i< n ; i++){
			if(i< src.length){
				points[i] = src[i];
			}else{
				int index = r.nextInt(src.length);
				GHPoint srcPnt = src[index];
				points[i] = new GHPoint(srcPnt.lat + 0.001*r.nextDouble() - 0.0005, srcPnt.lon+ 0.001*r.nextDouble() - 0.0005); 
			}
		}
	}
}
