package org.whispersystems.curve25519;

import static org.junit.Assert.assertTrue;


public class NativeCurve25519Test extends Curve25519Test {

  @Override
  public void testCheckProvider() {
    assertTrue(Curve25519.isNative());
  }

}
