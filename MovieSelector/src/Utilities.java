
    class Start{
        // Block für Variablen der KLasse
        boolean Debugging = false;
        boolean Logging = false;
        // Begin Constructor
        Start(String[] arguments){
            Message("Debugging is on");
            FileLogging("Debugging is on");

        }

        private void FileLogging (String messageToLog){

            if (Logging)
                Message("FileLogging is on writes to file : " + messageToLog);
        }
        private void Message(String messageText){
            if (Debugging)
                System.out.println(messageText);
        }

    }

