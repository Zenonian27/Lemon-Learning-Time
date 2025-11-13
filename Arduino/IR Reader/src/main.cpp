#include <Arduino.h>
#include <IRremote.hpp>  // For IRremote v4.x+

/*
Remote Codes I read.

OFF : 
Received IR code: 0x1A5A19
Protocol: 2
Bits: 22

Timer:
Received IR code: 0x1CDC99
Protocol: 2
Bits: 22


On/Sleep :
Received IR code: 0x11D199
Protocol: 2
Bits: 22

OSC/SWING :
Received IR code: 0x2E2E19
Protocol: 2
Bits: 22

Sleep/breeze:
Received IR code: 0x32F299
Protocol: 2
Bits: 22

*/


// Pin connected to KY-022 OUT
const int RECV_PIN = 3;

void setup() {
  Serial.begin(115200);
  while (!Serial) ;  // Wait for Serial (optional on Uno)
  IrReceiver.begin(RECV_PIN, ENABLE_LED_FEEDBACK); // Initialize the receiver, with pins and led lights.
  Serial.println("\n");
  Serial.println("-------------IR capture ready-------------\n");
}

void loop() {
  if (IrReceiver.decode()) {
    // print the raw IR data
    Serial.print("Received IR code: 0x");
    Serial.println(IrReceiver.decodedIRData.decodedRawData, HEX);

    // print the protocol used
    Serial.print("Protocol: ");
    Serial.println(IrReceiver.decodedIRData.protocol);

    // print number of bits
    Serial.print("Bits: ");
    Serial.println(IrReceiver.decodedIRData.numberOfBits);
    Serial.println("\n");
    // ready to receive the next value
    IrReceiver.resume();
  }
}