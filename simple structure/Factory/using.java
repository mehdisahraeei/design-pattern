


FactoryProducer producer=new FactoryProducer();
Media media=producer.setMedia("film");
Toast.makeText(context, media.dispMedia("New Film"), Toast.LENGTH_SHORT).show();
