package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void A_min() {
		Roots.calculate_roots(0,5,7);		
		String  root_expected = Root_Types.Not_quadratic.toString();		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void A_min_plus_one() {
		Roots.calculate_roots(1,4,4);		
		String  root_expected = Root_Types.Equal_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void A_nomi() {
		Roots.calculate_roots(4,4,4);		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void A_max() {
		Roots.calculate_roots(50,40,2);		
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void A_max_minus_one() {
		Roots.calculate_roots(49,-2,29);		
		String  root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void B_min() {
		Roots.calculate_roots(20,0,45);	
		String  root_expected = Root_Types.No_roots.toString();		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void B_min_plus_one() {
		Roots.calculate_roots(20,1,6);		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void B_nomi() {
		Roots.calculate_roots(4,4,4);		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void B_max() {
		Roots.calculate_roots(10,50,20);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void B_max_minus_one() {
		Roots.calculate_roots(23,49,15);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void C_min() {
		Roots.calculate_roots(10,20,0);	
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void C_min_plus_one() {
		Roots.calculate_roots(30,5,1);	
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void C_nomi() {
		Roots.calculate_roots(4,4,4);	
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void C_max() {
		Roots.calculate_roots(4,40,100);	
		String  root_expected = Root_Types.Equal_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void C_max_minus_one() {
		Roots.calculate_roots(26,5,99);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	}
