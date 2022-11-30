package com.example.bluetoothandroidapp

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.util.Log
import java.io.IOException
import java.util.*

@SuppressLint("MissingPermission")
class ConnectThread(private val device: BluetoothDevice) : Thread() {
    val uuid = "00001101-0000-1000-8000-00805F9B34FB"
    var mySocket: BluetoothSocket? = null

    init {
        try {
            mySocket = device.createRfcommSocketToServiceRecord(UUID.fromString(uuid))
        }catch (i: IOException){

        }
    }

    override fun run(){
        Log.d("MyLog", "Connecting...")
        try {
            mySocket?.connect()
            Log.d("MyLog", "Connected")
        }catch (i: IOException){
            Log.d("MyLog", "Can not connect to device: ${i.printStackTrace()}")
            closeConnection()
        }
    }

    fun closeConnection(){
        try {
            mySocket?.connect()
        }
        catch (i: IOException){

        }
    }
}