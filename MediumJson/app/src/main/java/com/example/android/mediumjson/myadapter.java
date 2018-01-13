package com.example.android.mediumjson;

/**
 * Created by Ahmed Abbas on 12/16/2017.
 */
public class myadapter extends RecyclerView.Adapter<myadapter.ViewHolder> {
    Context context;


    private List<movie> mDataset;
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public ImageView imageView;


        public ViewHolder(View v) {
            super(v);
            text = (TextView) v.findViewById(R.id.text);
            imageView = (ImageView) v.findViewById(R.id.icon);


        }
    }
    public void add(int position, movie item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }
    public void remove(movie item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }
    public myadapter(List<movie> myDataset) {
        mDataset = myDataset;
    }
    @Override
    public myadapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_card, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.text.setText(mDataset.get(position).getName());





        Glide.with(holder.imageView.getContext()).load(mDataset.get(position).getUrl()).into(holder.imageView);



    }
    @Override
    public int getItemCount() {
        return mDataset.size();
    }



}