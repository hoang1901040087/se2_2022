package tuts.tut9.todo.bridge.remotes;

import tuts.tut9.complete.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
		//Display the current status is 'volume down'
        System.out.println("Remote: Mute");
        //Decrease the current volume for 10
		device.setVolume(0);
    }
}
