
    class Start{
        // Block für Variablen der KLasse
        private boolean Debugging = false;
        private boolean Logging = false;
        // Begin Constructor
        Start(String[] arguments){
            ProcessArguments(arguments);
            DebuggingOff();
            Message("Debugging is on");
            FileLogging("Debugging is on");

        }
private void ProcessArguments(String[] Args){
    // Turn Debugging On or Off
    // Turn FileLogging On or Off
    DebuggingOn();
    DebuggingOff();
}

        public void DebuggingOn(){
            Debugging = true;
        }

        public void DebuggingOff(){
            Debugging = false;
        }

        private void FileLogging (String messageToLog){

            if (Logging)
                Message("FileLogging is on writes to file : " + messageToLog);
        }
        private void Message(String messageText){
            if (Debugging)
                System.out.println(messageText);
        }
        public static boolean OpenFile(String Filename){

           return true;
        }

    }

