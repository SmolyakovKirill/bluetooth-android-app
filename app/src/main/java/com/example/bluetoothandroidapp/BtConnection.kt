package com.example.bluetoothandroidapp

import android.bluetooth.BluetoothAdapter

class BtConnection(private val adapter: BluetoothAdapter) {

    fun connect(mac: String) {
        if (adapter.isEnabled && mac.isNotEmpty()) {
            val device = adapter.getRemoteDevice(mac)
            device.let {

            }
        }
    }
}